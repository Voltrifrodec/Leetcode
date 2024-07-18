/**
 * @param {string} s
 * @return {number}
 */
var countKeyChanges = function(s) {
    
    let changes = 0;
    let last_used = s[0].toLowerCase();
    for (let i = 1; i < s.length; i++) {
        if (s[i].toLowerCase() != last_used) {
            last_used = s[i].toLowerCase();
            changes++;   
        }
    }
        
    return changes;
};