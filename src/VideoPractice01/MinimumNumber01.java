package VideoPractice01;
public class MinimumNumber01 {
    public static void main(String[] args) {
        int abc [] [] = {
                {2,4,5},
                {3,0,7},
                {1,2,9},
        };
        int minNumber = abc[0][0];

        for (int i = 0; i < 3 ; i++)
        {
            for (int j = 0; j < 3; j++) {

                if(abc[i][j] < minNumber){
                    minNumber = abc [i][j];

                }
            }
        }
        System.out.println(minNumber);
    }

}
/*

public class MinimumNumber01 {
    public static void main(String[] args) {
        // একটি ৩x৩ ম্যাট্রিক্স ডিফাইন করা হলো
        int abc[][] = {
                {2, 4, 5},
                {3, 0, 7},
                {1, 2, 9},
        };

        // সর্বনিম্ন মান ধরা হলো প্রথম এলিমেন্ট হিসেবে
        int minNumber = abc[0][0];

        // দুইটি ফর লুপ ব্যবহার করে ম্যাট্রিক্সের প্রতিটি এলিমেন্ট পরিদর্শন করা হচ্ছে
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // যদি বর্তমান এলিমেন্ট minNumber এর চেয়ে ছোট হয়
                if (abc[i][j] < minNumber) {
                    // তাহলে minNumber কে বর্তমান এলিমেন্টের মানে আপডেট করা হবে
                    minNumber = abc[i][j];
                }
            }
        }

        // সর্বনিম্ন মান প্রিন্ট করা হচ্ছে
        System.out.println(minNumber);
    }
}
বিস্তারিত বর্ণনা:
int abc[][] = { {2, 4, 5}, {3, 0, 7}, {1, 2, 9} }; - এটি হল একটি ৩x৩ ম্যাট্রিক্স ডিফাইন করা হয়েছে যা তিনটি সারি এবং তিনটি কলাম থাকে।

int minNumber = abc[0][0]; - সর্বনিম্ন মান হিসেবে প্রথম এলিমেন্ট ধরা হয়েছে। প্রাথমিকভাবে এর মান 2 হবে।

for (int i = 0; i < 3; i++) { - এটি হল বাইরের লুপ, যা ব্যবহার করে ম্যাট্রিক্সের প্রতিটি সারি পরিদর্শন করে। i এর মান 0 থেকে শুরু হয় এবং 3 এর কম হতে থাকবে।

for (int j = 0; j < 3; j++) { - এটি হল ভিতরের লুপ, যা প্রতিটি সারির প্রতিটি এলিমেন্ট পরিদর্শন করে। j এর মান 0 থেকে শুরু হয় এবং 3 এর কম হতে থাকবে।

if (abc[i][j] < minNumber) { minNumber = abc[i][j]; } - যদি বর্তমান এলিমেন্ট minNumber এর চেয়ে ছোট হয় তাহলে minNumber কে আপডেট করা হয়।

System.out.println(minNumber); - সর্বনিম্ন মান প্রিন্ট করা হয়।
 */