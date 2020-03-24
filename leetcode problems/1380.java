1380. Lucky Numbers in a Matrix

Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]



class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> minRow=new ArrayList<Integer>();
        List<Integer> answer=new ArrayList<Integer>();
        int[] maxCol=new int[matrix[0].length];
        List<Integer> maxColAL=new ArrayList<Integer>();
        
        for(int i=0;i<matrix.length;i++){
            int temp=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if (temp>matrix[i][j])
                    temp=matrix[i][j];
                
                if(matrix[i][j]>maxCol[j])
                    maxCol[j]=matrix[i][j];
                
                if(i==matrix.length-1)
                    maxColAL.add(maxCol[j]);
            }
            minRow.add(temp);
        }
        

        for(int i=0;i<minRow.size();i++){
            if(maxColAL.contains(minRow.get(i)))
                answer.add(minRow.get(i));
        }
        
        return answer;
        
    }
}
