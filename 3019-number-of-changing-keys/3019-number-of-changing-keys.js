/**
 * @param {string} s
 * @return {number}
 */
var countKeyChanges = function(s) {
    
    let changes = 0;
    let last_used = s[0].toLowerCase();
    for (let i = 1; i < s.length; i++) {
        let c = s[i].toLowerCase();
        if (c != last_used) {
            last_used = c;
            changes++;   
        }
    }
        
    return changes;
};