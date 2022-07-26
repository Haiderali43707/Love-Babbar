class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        {
        Node previous = null;
        Node current = head;
 
        // take an empty set to store linked list nodes for future reference
        Set<Integer> set = new HashSet<>();
 
        // do till the linked list is empty
        while (current != null)
        {
            // if the current node is seen before, ignore it
            if (set.contains(current.data)) {
                previous.next = current.next;
            }
            else {
                // insert the current node into the set and proceed to the next node
                set.add(current.data);
                previous = current;
            }
            current = previous.next;
        }
 
        return head;
        }
}
