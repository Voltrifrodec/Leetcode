/**
 * @param {string} s
 * @return {number}
 */
var countKeyChanges = function(s) {
    
    let changes = 0;
    s = s.toLowerCase();
    let last_used = s[0];
    for(let i = 1; i < s.length; i++) {
        if(last_used != s[i]) {
            changes++;
            last_used = s[i];
        }
    }
        
    return changes;
};