class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 0;
        while (!queue.isEmpty()){
            int lenth = queue.size();
            List<Integer> line = new LinkedList<>();
            for (int i=0;i<lenth;i++){
                if(flag%2==0)line.add(queue.element().val);
                if(flag%2==1)line.add(0,queue.element().val);
                //System.out.print(queue.element().val);
                if(queue.element().left!=null) queue.add(queue.element().left);
                if(queue.element().right!=null) queue.add(queue.element().right);
                queue.poll();
            }
            flag += 1;
            list.add(line);
            //System.out.println();
        }
        return list;
    }
}