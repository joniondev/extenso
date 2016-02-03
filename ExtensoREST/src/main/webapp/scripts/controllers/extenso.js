angular.module('App')
        .controller('ExtensoCtrl', ['$http', '$scope', function ($http, $scope) {
                $scope.valor = 0;
                $scope.extenso = '';

                $scope.transcrever = function () {
                    if (!$scope.valor || $scope.valor.length === 0) {
                        $scope.mensagem = 'Um valor deve ser informado.';
                        return;
                    }

                    if (!$scope.valor || $scope.valor <= 0) {
                        $scope.mensagem = 'O valor deve ser um número positivo.';
                        return;
                    }
                    $http.get('http://localhost:8080/ExtensoREST/extenso/' + $scope.valor)
                            .success(function (response, status, headers, config) {
                                $scope.extenso = response;
                            })
                            .error(function (response, status, headers, config) {
                                alert(response);
                                $scope.mensagem = response.mensagem;
                            });
                };
            }]);