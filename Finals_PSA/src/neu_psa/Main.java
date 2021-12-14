package neu_psa;


import java.util.*;

public class Main {
    static int index;
    static HashMap<Integer, Integer> inOrderMap = new HashMap<>();

    public static void main(String[] args) {
     //Q1
	int[] inOrder = {4,2,5,1,6,3,7};
    int[] levelOrder = {1,2,3,4,5,6,7};
    TreeNode res = TreeFromInorderLevelOrder(levelOrder, inOrder);
    //Q2
    TreeNode Tree1 = new TreeNode(10);
    Tree1.left = new TreeNode(7);
    Tree1.right = new TreeNode(15);
    Tree1.left.right = new TreeNode(9);
    Tree1.right.left = new TreeNode(11);

    System.out.println(isFoldable(Tree1));
    //Q3
    int[] jumps = {1,3,5,8,9,2,6,7,6,8,9};
    System.out.println(minJumps(jumps));
    //Q4
      String[]   words = {"hello","leetcode"};
      String order = "hlabcdefgijkmnopqrstuvwxyz";
      System.out.println(alienDict(words, order));

    }

    //Q1
    public static TreeNode TreeFromInorderLevelOrder(int[] levelOrder, int[] inOrder){
        index = 0;
        for(int i = 0; i< inOrder.length; i++){
            inOrderMap.put(inOrder[i],i);
        }
        return constructTree(levelOrder, 0, inOrder.length-1);
    }

    public static TreeNode constructTree(int[] levelOrder, int low, int high){
        if(low <= high && index < levelOrder.length){
            TreeNode node = new TreeNode(levelOrder[index]);
            index = index+1;
            int i = inOrderMap.get(node.data);
            node.left = constructTree(levelOrder, low, i-1);
            node.right = constructTree(levelOrder, i+1, high);
            return node;
        }
        return null;
    }

    //Q2
    public static boolean isFoldable(TreeNode root){
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return  isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }

    //Q3
    public static int minJumps(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return 1;
        }
        int[] jumps = new int[arr.length+1];
        Arrays.fill(jumps, Integer.MAX_VALUE);
        jumps[0] = 0;

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] + i > j){
                    if(jumps[j] > arr[i] + 1){
                        jumps[j]  = arr[i] + 1;
                    }
                }
            }
        }
        if(jumps[jumps.length - 1] == Integer.MAX_VALUE ){
            return  -1;
        }
        return jumps[jumps.length - 1];
    }

    //Q4
    public static boolean alienDict(String[] words, String order){
        Map<Character, List<Character>> adjList = new HashMap<>();
        Map<Character, Integer> count = new HashMap<>();

        for(String word : words){
            for(char c : word.toCharArray()){
                adjList.put(c, new ArrayList<>());
                count.put(c, 0);
            }
        }
        for(int i = 0; i < words.length -1; i++){

                String word1 = words[i];
                String word2 = words[i+1];

                if(word1.length() > word2.length() && word1.startsWith(word2)){
                    return false;
                }
                for(int k = 0; k < Math.min(word1.length(), word2.length()); k++){
                    if(word1.charAt(k) != word2.charAt(k)){
                        adjList.get(word1.charAt(k)).add(word2.charAt(k));
                        count.put(word2.charAt(k), count.get(word2.charAt(k))+1);
                        break;
                    }
                }

        }
        Queue<Character> queue = new LinkedList<>();
        for(Character i : count.keySet()){
            if(count.get(i) == 0){
                queue.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            Character removed = queue.remove();
            sb.append(removed);
            for(char c : adjList.get(removed)){
                count.put(c, count.get(c) - 1);
                if(count.get(c) == 0){
                    queue.add(c);
                }
            }
        }

        if(sb.length() != count.size()){
            return false;
        }

        Map<Character, Integer> dictionary = new HashMap<>();
        for(int m = 0; m < sb.length(); m++){
            dictionary.put(sb.charAt(m), m);
        }

        int minIndex = Integer.MIN_VALUE;
        for(Character c : order.toCharArray()){
            if(dictionary.containsKey(c)){
                if(dictionary.get(c) > minIndex){
                    minIndex = dictionary.get(c);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
