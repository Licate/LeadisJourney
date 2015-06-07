app.controller('editorCtrl', ['$scope', '$http', function ($scope, $http) {
    var editor = ace.edit("editor");
    editor.setTheme("ace/theme/chrome");
    editor.getSession().setMode("ace/src-noconflict/c_cpp");

    $scope.comp = function () {
        var code = editor.getSession().getValue();
        console.log(code);
        $http.post("http://localhost:8080/code", {code: code}).success();
    };
    $scope.dest = function() {
        editor.getSession().setValue("");
    };
}]);