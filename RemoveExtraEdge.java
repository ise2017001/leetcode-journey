
//Given a binary tree, where an arbitary node has 2 parents i.e two nodes in the tree have the same child. Identify the defective node and remove an extra edge to fix the tree.
public class RemoveExtraEdge {
	public static Node removeExtraEdge(Node root) {
		return removeExtraEdgeHelper(root, new HashSet<Node>());  
	}

	public static Node removeExtraEdgeHelper(Node node, Set<Node> seen) {
		if (node == null) return null;
		
		//if already added to the set, cut the connection to this node from the parent
		if (!seen.add(node)) {
			return null;
		}

		//we are setting the child node edges here
		node.left = removeExtraEdgeHelper(node.left, seen);
		node.right = removeExtraEdgeHelper(node.right, seen);
		return node;
	}
}