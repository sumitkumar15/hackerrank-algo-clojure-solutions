process.stdin.resume()
process.stdin.setEncoding('ascii')

var input_stdin = ''
var input_stdin_array = ''
var input_currentline = 0

process.stdin.on('data', function (data) {
  input_stdin += data
})

process.stdin.on('end', function () {
  input_stdin_array = input_stdin.split('\n')
  main()
})

function readLine () {
  return input_stdin_array[input_currentline++]
}

/// //////////// ignore above this line ////////////////////

function hackerlandRadioTransmitters (x, k) {
  // Complete this function
  x.sort((a, b) => a - b)
  let counter = 0
  let begin = 0
  for (let i = 0; i < x.length; i) {
    while (x[i] - x[begin] <= k) {
      i++
    }
    counter++
    begin = i - 1
    // console.log('beg', begin)
    while (x[i] - x[begin] <= k) {
      i++
    }
    begin = i
    // console.log('beg', begin,' ' ,i)
  }
  return counter
}

function main () {
  var n_temp = readLine().split(' ')
  var n = parseInt(n_temp[0])
  var k = parseInt(n_temp[1])
  x = readLine().split(' ')
  x = x.map(Number)
  var result = hackerlandRadioTransmitters(x, k)
  process.stdout.write('' + result + '\n')
}
