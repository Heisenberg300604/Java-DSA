/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    return Object.keys(obj).length == 0;
    // Object.keys(obj) --> this returns the array of keys 
    // and .length then finds the length if empty then true else false
};
