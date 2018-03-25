'use strict'

const fs = require('fs')

process.stdin.resume()
process.stdin.setEncoding('utf-8')

let inputString = ''
let currentLine = 0

process.stdin.on('data', inputStdin => {
  inputString += inputStdin
})

process.stdin.on('end', _ => {
  inputString = inputString.trim().split('\n').map(str => str.trim())

  main()
})

function readLine () {
  return inputString[currentLine++]
}

/*
 * Complete the knightlOnAChessboard function below.
 */
function possiblePairs (n, current, k, l) {
  let possible = []
  possible.push([current[0] + k, current[1] + l])
  possible.push([current[0] + k, current[1] - l])
  possible.push([current[0] - k, current[1] + l])
  possible.push([current[0] - k, current[1] - l])
  possible.push([current[0] + l, current[1] + k])
  possible.push([current[0] + l, current[1] - k])
  possible.push([current[0] - l, current[1] + k])
  possible.push([current[0] - l, current[1] - k])
  return possible.filter(p => p[0] >= 0 && p[0] < n && p[1] >= 0 && p[1] < n)
}
function testFinal (n, arr) {
  for (let e of arr) {
    if (e[0] === n - 1 && e[1] === n - 1) return true
  }
  return false
}
function contains (e, arr) {
  for (let k of arr) {
    if (e[0] === k[0] && e[1] === k[1]) return true
  }
  return false
}
function dobfs (n, [k, l]) {
  let visited = []
  let q = [[0, 0]]
  let len = 0
  while (q.length !== 0) {
    let p = []
    for (let e of q) {
        console.log(e)
      if (!contains(e, visited)) {
        let pp = possiblePairs(n, e, k, l)
        if (testFinal(n, pp)) return len + 1
        p.push(...pp)
        visited.push(e)
      }
    }
    q = p
    len++
  }
  return -1
}
function knightlOnAChessboard (n) {
    let r = []
  for (let i = 1; i < n; i++) {
    let pairs = []
    for (let j = 1; j < n; j++) {
      pairs.push(dobfs(n, [i, j]))
    }
    r.push(pairs)
  }
  return r
}

function main () {
  const ws = fs.createWriteStream(process.env.OUTPUT_PATH)

  const n = parseInt(readLine(), 10)

  let result = knightlOnAChessboard(n)

  ws.write(result.map(x => x.join(' ')).join('\n') + '\n')

  ws.end()
}
