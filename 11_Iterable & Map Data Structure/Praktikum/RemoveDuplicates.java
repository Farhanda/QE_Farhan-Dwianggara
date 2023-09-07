public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        int panjang1 = hapusDuplikat(nums1);
        System.out.println(panjang1); // Output: 4

        int[] nums2 = {2, 2, 2, 11};
        int panjang2 = hapusDuplikat(nums2);
        System.out.println(panjang2); // Output: 2
    }

    public static int hapusDuplikat(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int jumlahUnik = 1; // Inisialisasi dengan 1 karena elemen pertama selalu unik

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[jumlahUnik] = nums[i]; // Pindahkan elemen unik ke depan
                jumlahUnik++;
            }
        }

        return jumlahUnik;
    }
}
