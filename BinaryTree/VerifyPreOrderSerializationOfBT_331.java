
// 331. Verify Preorder Serialization of a Binary Tree

// One way to serialize a binary tree is to use preorder traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as '#'.

public class VerifyPreOrderSerializationOfBT_331 {
     public boolean isValidSerialization(String s) {
        String str[]=s.split(",");
        int v = 1;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("#")){
                if(v==0)
                return false;
               v=v-1;
            }else{
                if(v==0)
                return false;
                v=v-1;
                v=v+2;
            }
        }
        if(v==0){
            return true;
        }
        else{
            return false;
        }
    }
}
