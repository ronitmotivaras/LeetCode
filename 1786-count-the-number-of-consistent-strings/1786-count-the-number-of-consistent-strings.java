class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char s[] = allowed.toCharArray();

        
        int count=0;

        for(int i=0;i<words.length;i++)
        {
            // System.out.print(words[i]+" "+i+"      ");
            boolean flag1 = false;
            for(int j=0;j<words[i].length();j++)
            {
                char temp = words[i].charAt(j);
                boolean flag = false;
                for(int k=0;k<s.length;k++)
                {
                    if(temp==s[k])
                    {
                        flag=true;
                        break;
                    }
                }

                if(flag==false)
                {
                    flag1=true;
                    break;
                }
                
            }

            if(flag1==false)
            {
                count++;
            }
           
        }
        
        

        return count;
    }
}