/*
直接暴力过得，太久没刷题居然做了很久，思路并不是很简单，用正则表达式会简单一点。
*/

class Solution {
    public int numUniqueEmails(String[] emails) {
        String ans_emails[] = new String[100];
        String ans_email = new String();
        int ans = 0;
        for (int i = 0; i < emails.length; i++){
            char[] cmp = new char[emails[i].length()];
            boolean flag1 = false;
            boolean flag2 = false;
            int k = 0;
            for (int j = 0; j < emails[i].length(); j++){
                if (emails[i].charAt(j) == '@'){
                    flag1 = true;
                }
                if (flag1 == false && flag2 == true){
                    continue;
                }
                if (flag1 == false){
                    if (emails[i].charAt(j) == '.'){
                        continue;
                    } else if (emails[i].charAt(j) == '+'){
                        flag2 = true;
                        continue;
                    } else {
                        cmp[k++] = emails[i].charAt(j);
                    }
                }
                if (flag1 == true){
                    cmp[k++] = emails[i].charAt(j);
                }
            }
            char[] real_cmp = new char[k];
            for (int j = 0; j < k; j++){
                real_cmp[j] = cmp[j];
            }
            ans_email = String.valueOf(real_cmp);
            boolean flag3= false;
            for (int j = 0; j < i; j++){
                if (ans_email.equals(ans_emails[j]) == true){
                    flag3 =true;
                    break;
                }
            }
            if (flag3 == false){
                ans_emails[ans++] = ans_email;
            }
        }
        return ans;
    }
    
}

//官方题解，也太简单了吧...
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll(".", "");
            seen.add(local + rest);
        }

        return seen.size();
    }
}