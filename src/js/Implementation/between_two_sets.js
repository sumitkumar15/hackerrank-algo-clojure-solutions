process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////
function lcm (a, b) {
    let greater = a > b ? a : b
    let small = a < b ? a : b
    let k = greater
    while (k % small !== 0) {
        k += greater
    }
    return k
}

function getTotalX(a, b) {
    // Complete this function
    let s_b = Math.min(...b)
    let lc = a.reduce(lcm)
    let dividers = []
    for (let d = lc; d <= s_b; d += lc) {
        dividers.push(d)
    }
    //console.log(dividers)
    return dividers.filter(x => b.every(f => f % x === 0)).length
}

function main() {
    var n_temp = readLine().split(' ');
    var n = parseInt(n_temp[0]);
    var m = parseInt(n_temp[1]);
    a = readLine().split(' ');
    a = a.map(Number);
    b = readLine().split(' ');
    b = b.map(Number);
    var total = getTotalX(a, b);
    process.stdout.write("" + total + "\n");

}
