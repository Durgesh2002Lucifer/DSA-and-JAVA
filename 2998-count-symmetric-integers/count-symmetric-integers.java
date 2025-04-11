class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            if (sb.length() % 2 == 0) {
                int leftsum = 0;
                int rightsum = 0;
                for (int j = 0; j < sb.length() / 2; j++) {
                    leftsum += sb.charAt(j) - '0';
                }
                for (int j = sb.length() / 2; j < sb.length(); j++) {
                    rightsum += sb.charAt(j) - '0';
                }
                if (leftsum == rightsum) {
                    count++;
                }
            }
        }
        return count;
    }
}