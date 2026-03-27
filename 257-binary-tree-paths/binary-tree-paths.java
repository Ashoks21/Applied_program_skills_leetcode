class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,new StringBuilder());
        return ans;
    }
    void dfs(TreeNode root,StringBuilder path){
        if(root == null) return;
        int len = path.length();
        if(len != 0) path.append("->");
        path.append(root.val);
        if(root.right == null && root.left == null){
            ans.add(String.valueOf(path));
        }else{
            if(root.left != null)dfs(root.left,path);
            if(root.right != null)dfs(root.right,path);
        }
        path.setLength(len);//backtracking
    }
}