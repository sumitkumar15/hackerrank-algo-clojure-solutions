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

function root (connected, x) {
  if (connected[x] === x) return x
  return root(connected, connected[x])
}

function journeyToMoon (n, astronaut) {
  // Complete this function
  let connected = [...Array(n).keys()]
  for (let p of astronaut) {
    let r1 = root(connected, p[0])
    let r2 = root(connected, p[1])
    if (r1 !== r2) {
      connected[r1] = r2
    }
  }
  let objset = {}
  for (let c of connected) {
    let r = root(connected, c)
    if (objset.hasOwnProperty(r)) objset[r]++
    else objset[r] = 1
  }
  let vals = Object.keys(objset).map(k => objset[k])
  let z = n
  return vals.map(r => {
    let a = r * (z - r)
    z = z - r
    return a
  }).reduce((a, b) => a + b)
}

function main () {
  var n_temp = readLine().split(' ')
  var n = parseInt(n_temp[0])
  var p = parseInt(n_temp[1])
  var astronaut = []
  for (astronaut_i = 0; astronaut_i < p; astronaut_i++) {
    astronaut[astronaut_i] = readLine().split(' ')
    astronaut[astronaut_i] = astronaut[astronaut_i].map(Number)
  }
  var result = journeyToMoon(n, astronaut)
  process.stdout.write('' + result + '\n')
}
