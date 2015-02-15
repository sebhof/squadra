/* 
 * Copyright (C) 2015 shofmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

(function () {

    var app = angular.module('squadra.applicationControllers', []);
    
    app.controller('ApplicationCtrl', ['$scope', '$http', '$location', function ($scope, $http, $location) {
            
            var load = function () {                
                var redirect = "/";
                $http.get('services/session')
                        .success(function (data) {
                            $scope.session = data;
                            if($scope.session.userRole === 'ADMIN') {
                                redirect = "/admin";
                            } else {
                                redirect = "/user";
                            }
                            $location.path(redirect);
                        })
                        .error(function (data) {
                            console.error("Error loading roles: "+data)
                    //TODO handle error
                        });
            };
            load();                        
            
    }]);

})();
