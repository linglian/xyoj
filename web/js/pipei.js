var flag = true;

function showHelpInput() {
    layui.use('layer', function () {
        var layer = layui.layer;
        layer.msg("可以根据自己程序填写输入样例<br>输入规则与运行真机时一样。");
    });
}

function showHelpOutput() {
    layui.use('layer', function () {
        var layer = layui.layer;
        layer.msg("可以根据自己程序填写输出样例<br>系统会将输出样例与实际输出匹配。");
    });
}
function noNumbers(e)
{
    var keynum;
    var keychar;
    keynum = window.event ? e.keyCode : e.which;
    keychar = String.fromCharCode(keynum);
    var area = document.getElementById("codes");
    var start = area.selectionStart;
    var end = area.selectionEnd;
    var s1 = area.value.substring(0, area.selectionStart);
    var s2 = area.value.substring(area.selectionStart);
    switch (keynum) {
        case 9: // tab
            area.value = s1 + "    " + s2;
            area.selectionStart = start + 4;
            area.selectionEnd = end + 4;
            e.preventDefault();
            break;
        case 13: // 回车
            var str = "";
            var startFlag = start - 1;
            var i;
            for (i = 0; area.value[start - 1 - i] != '\n' && start - 1 - i >= 0; i++) {
                if (area.value[start - 1 - i] != ' ') {
                    startFlag = start - 1 - i;
                }
            }
            console.log(startFlag);
            console.log(start - 1 - i);
            var j;
            for (j = 0; j < startFlag - (start - i); j++) {
                str += " ";
            }
            if (area.value[start - 1] == '{') {
                area.value = s1 + "\n    " + str + "\n" + str + s2;
                area.selectionStart = start + str.length + 5;
                area.selectionEnd = end + str.length + 5;
            } else {
                area.value = s1 + "\n" + str + s2;
                area.selectionStart = start + str.length + 1;
                area.selectionEnd = end + str.length + 1;
            }
            e.preventDefault();
            break;
        case 219: // 中括号
            if (flag) {
                area.value = s1 + "[]" + s2;
                area.selectionStart = start + 1;
                area.selectionEnd = end + 1;
                e.preventDefault();
            }
            break;
    }
    //console.log(keynum);
    if (e.shiftKey) {
        switch (keynum) {
            case 57: // 小括号
                if (flag) {
                    area.value = s1 + "()" + s2;
                    area.selectionStart = start + 1;
                    area.selectionEnd = end + 1;
                    e.preventDefault();
                }
                break;
            case 219: // 花括号
                if (flag) {
                    area.value = s1 + "{}" + s2;
                    area.selectionStart = start + 1;
                    area.selectionEnd = end + 1;
                    e.preventDefault();
                }
                break;
        }
    }
    if (e.ctrlKey) {
        switch (keynum) {
            case 90: // ctrl + z
                e.preventDefault();
                break;
        }
    }
}