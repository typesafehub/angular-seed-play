'use strict';

define(['webjars/angularjs/1.0.5/angular.js'], 
  function() {

/* Filters */

angular.module('myApp.filters', []).
  filter('interpolate', ['version', function(version) {
    return function(text) {
      return String(text).replace(/\%VERSION\%/mg, version);
    }
  }]);

});