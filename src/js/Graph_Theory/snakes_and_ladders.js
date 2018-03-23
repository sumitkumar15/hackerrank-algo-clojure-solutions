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

function findNextSix (board, currentPos) {
  let arr = []
  for (let i = 1; i <= 6; i++) {
    if (currentPos + i < 100) arr.push(board[currentPos + i])
    else arr.push(null)
  }
  return arr
}

function quickestWayUp (ladders, snakes) {
  // Complete this function
  let board = [...Array(100).keys()]
  for (let l of ladders) {
    if (l[0] < l[1]) board[l[0] - 1] = board[l[1] - 1]
    else board[l[1] - 1] = board[l[0] - 1]
  }
  for (let l of snakes) {
    if (l[0] > l[1]) board[l[0] - 1] = board[l[1] - 1]
    else board[l[1] - 1] = board[l[0] - 1]
  }
  let adjList = [...Array(100).keys()].map(x => findNextSix(board, x))
  // console.log(adjList)
  let queue = [0]
  let steps = 0
  let visited = []
  while (queue.length > 0) {
    let nqueue = []
    if (queue.includes(99)) return steps
    for (let e of queue) {
      // console.log(e, adjList[e])
      if (!visited.includes(e)) {
        nqueue.push(...adjList[e])
        visited.push(e)
      }
    }
    steps++
    queue = nqueue
  }
  // if queque becomes empty means no path exists
  return -1
}

function main () {
  var t = parseInt(readLine())
  for (var a0 = 0; a0 < t; a0++) {
    var n = parseInt(readLine())
    var ladders = []
    for (ladders_i = 0; ladders_i < n; ladders_i++) {
      ladders[ladders_i] = readLine().split(' ')
      ladders[ladders_i] = ladders[ladders_i].map(Number)
    }
    var m = parseInt(readLine())
    var snakes = []
    for (snakes_i = 0; snakes_i < m; snakes_i++) {
      snakes[snakes_i] = readLine().split(' ')
      snakes[snakes_i] = snakes[snakes_i].map(Number)
    }
    var result = quickestWayUp(ladders, snakes)
    process.stdout.write('' + result + '\n')
  }
}
