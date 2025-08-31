class Solution {
    public int findPeakElement(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int BinarySearch(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (isAsc) {
                if (target < val) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > val) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int firstTry = BinarySearch(mountainArr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;
        return BinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
}

