app.controller('editorCtrl', ['$scope', '$http', function ($scope, $http) {
    var editor = ace.edit("editor");
    editor.setTheme("ace/theme/chrome");
    editor.getSession().setMode("ace/mode/c_cpp");
    editor.getSession().setMode("../assets/ace/src/mode-c_cpp");

    $scope.comp = function () {
        var code = editor.getSession().getValue();
        console.log(code);
        $http.post("http://localhost:8080/code", {code: code}).success();
    }
}]);