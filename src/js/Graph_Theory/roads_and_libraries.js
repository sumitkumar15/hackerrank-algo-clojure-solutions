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
function root (citymap, a) {
  if (a === citymap[a]) return a
  return root(citymap, citymap[a])
}

function roadsAndLibraries (n, c_lib, c_road, cities) {
  // Complete this function
  if(c_lib <= c_road) return c_lib * n

  let connected = [...Array(n).keys()]
  let setcount = n
  for (let c of cities) {
    let r1 = root(connected, c[0]-1)
    let r2 = root(connected, c[1]-1)
    if (r1 !== r2) {
      connected[r1] = r2
      setcount--
    }
  }
  return setcount * c_lib + (n - setcount) * c_road
}

function main () {
  var q = parseInt(readLine())
  for (var a0 = 0; a0 < q; a0++) {
    var n_temp = readLine().split(' ')
    var n = parseInt(n_temp[0])
    var m = parseInt(n_temp[1])
    var c_lib = parseInt(n_temp[2])
    var c_road = parseInt(n_temp[3])
    var cities = []
    for (cities_i = 0; cities_i < m; cities_i++) {
      cities[cities_i] = readLine().split(' ')
      cities[cities_i] = cities[cities_i].map(Number)
    }
    var result = roadsAndLibraries(n, c_lib, c_road, cities)
    process.stdout.write('' + result + '\n')
  }
}
