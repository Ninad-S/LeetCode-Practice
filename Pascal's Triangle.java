class Solution {
    public List<List<Integer>> generate(int numRows,int i, List<List<Integer>> rows)
    {
        if (i==numRows)
        {
            return rows;
        }
        rows.add(new ArrayList<>());
        rows.get(i).add(1);
        rows.get(i).add(1);
        ArrayList<Integer> sums = new ArrayList<>();
        for (int j = 0; j < rows.get(i-1).size()-1; j++)
        {
            sums.add(rows.get(i-1).get(j) + rows.get(i-1).get(j+1));
        } 
        for (int j = 0; j < sums.size(); j++)
        {
            rows.get(i).add(j+1,sums.get(j));
        }
        return generate(numRows,i+1,rows);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(new ArrayList<>());
        rows.get(0).add(1);
        if (numRows==1)
        {
            return rows;
        }
        rows.add(new ArrayList<>());
        rows.get(1).add(1); rows.get(1).add(1);
        if (numRows==2)
        {
            return rows;
        }
        return generate(numRows,2,rows);
        
    }
}
