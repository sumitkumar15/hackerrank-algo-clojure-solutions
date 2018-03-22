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

function candies (n, arr) {
  // Complete this function
  let temp = []
  for (let i = 0; i < n; i++) temp.push(1)
  for (let i = 1; i < n; i++) {
    if (arr[i] > arr[i - 1]) temp[i] = temp[i - 1] + 1
  }
  for (let i = n - 2; i >= 0; i--) {
    if (arr[i] > arr[i + 1]) {
      if (temp[i] <= temp[i + 1]) temp[i] = temp[i + 1] + 1
    }
  }
  return temp.reduce((a, b) => a + b)
}

function main () {
  var n = parseInt(readLine())
  var arr = []
  for (var arr_i = 0; arr_i < n; arr_i++) {
    arr[arr_i] = parseInt(readLine())
  }
  var result = candies(n, arr)
  process.stdout.write('' + result + '\n')
}
