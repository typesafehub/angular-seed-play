'use strict';

define(['webjars/angularjs/1.0.5/angular.js'], 
  function() {

/* Directives */


angular.module('myApp.directives', []).
  directive('appVersion', ['version', function(version) {
    return function(scope, elm, attrs) {
      elm.text(version);
    };
  }]);

});