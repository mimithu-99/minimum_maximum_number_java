package VideoPractice01;

public class MaximumNumberSecondColumn {
    public static void main(String[] args) {
        int abc [][] = {
                {2,4,5},
                {3,0,7},
                {1,2,9}
        };
        int minimumNumber = abc [0][0];
        int minimumColumn = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(abc[i][j] < minimumNumber) // 2
                {
                    minimumNumber = abc[i][j];
                    minimumColumn = j;
                }

            }

        }
        // = 1
        int max = abc [0][minimumColumn];
        int k = 0;
        while (k < 3)
        {
            if(abc[k][minimumColumn] > max)
            {
                max = abc [k][minimumColumn];
            }
            k++;
        }
        System.out.println(max);


    }
}
/*
public class MaximumNumberSecondColumn {
    public static void main(String[] args) {
        // 2D অ্যারে তৈরি করা হয়েছে যেখানে ৩টি সারি (row) এবং ৩টি কলাম (column) আছে
        int abc [][] = {
                {2,4,5},
                {3,0,7},
                {1,2,9}
        };

        // সর্বনিম্ন সংখ্যাটি ধরে রাখার জন্য প্রথম উপাদান (element) গ্রহণ করা হয়েছে
        int minimumNumber = abc [0][0];

        // সর্বনিম্ন সংখ্যাটি কোন কলামে আছে তা খুঁজে বের করার জন্য একটি ভেরিয়েবল ঘোষণা করা হয়েছে
        int minimumColumn = 0;

        // বাইরের লুপটি সারির (row) জন্য
        for (int i = 0; i < 3; i++) {
            // ভিতরের লুপটি কলামের (column) জন্য
            for (int j = 0; j < 3; j++) {
                // যদি বর্তমান উপাদানটি (element) minimumNumber এর চেয়ে ছোট হয়
                if(abc[i][j] < minimumNumber) {
                    // তাহলে সেটিকে minimumNumber হিসেবে ধরে নাও
                    minimumNumber = abc[i][j];
                    // এবং কলামের নম্বরটি ধরে নাও (এটি পরে প্রয়োজন হতে পারে)
                    minimumColumn = j;
                }
            }
        }

        // সর্বনিম্ন সংখ্যার কলামে সর্বাধিক সংখ্যা খুঁজে বের করার জন্য সর্বপ্রথম উপাদানটি ধরে নেওয়া হয়েছে
        int max = abc [0][minimumColumn];
        int k = 0;

        // while লুপ ব্যবহার করে প্রতিটি সারির উপাদান চেক করা হবে
        while (k < 3) {
            // যদি বর্তমান উপাদানটি max এর চেয়ে বড় হয়
            if(abc[k][minimumColumn] > max) {
                // তাহলে সেটিকে max হিসেবে ধরে নাও
                max = abc [k][minimumColumn];
            }
            k++;
        }
        // সর্বাধিক সংখ্যাটি প্রিন্ট করা হচ্ছে
        System.out.println(max);
    }
}
এখন প্রতিটি লাইনের কাজ সহজ ভাষায়:

public class MaximumNumberSecondColumn {

এই লাইনটি একটি নতুন ক্লাস তৈরি করছে যার নাম MaximumNumberSecondColumn।
public static void main(String[] args) {

এই লাইনটি প্রধান মেথড main ঘোষণা করছে যা প্রোগ্রাম শুরু হওয়ার স্থান।
int abc [][] = { ... };

এটি একটি 2D অ্যারে তৈরি করছে এবং সেটির মধ্যে ৩টি সারি এবং ৩টি কলাম দিয়ে পূর্ণ করছে।
int minimumNumber = abc [0][0];

এই লাইনটি প্রথম উপাদানটিকে সর্বনিম্ন সংখ্যা হিসেবে ধরে নিচ্ছে।
int minimumColumn = 0;

এই লাইনটি একটি ভেরিয়েবল তৈরি করছে যা সর্বনিম্ন সংখ্যার কলামের নম্বর সংরক্ষণ করবে।
for (int i = 0; i < 3; i++) {

এটি বাইরের লুপ যা সারি (row) গুলি নিয়ে কাজ করবে। এটি ৩ বার চলবে কারণ আমাদের ৩টি সারি আছে।
for (int j = 0; j < 3; j++) {

এটি ভিতরের লুপ যা কলাম (column) গুলি নিয়ে কাজ করবে। এটি ৩ বার চলবে কারণ আমাদের ৩টি কলাম আছে।
if(abc[i][j] < minimumNumber) {

এই শর্তটি চেক করে যদি বর্তমান উপাদানটি (abc[i][j]) সর্বনিম্ন সংখ্যার চেয়ে ছোট হয়।
minimumNumber = abc[i][j];

যদি শর্তটি সত্য হয় তাহলে বর্তমান উপাদানটি নতুন সর্বনিম্ন সংখ্যা হিসেবে ধরে নেয়া হয়।
minimumColumn = j;

এবং বর্তমান কলামের নম্বরটি সর্বনিম্ন সংখ্যার কলাম হিসেবে ধরে নেয়া হয়।
int max = abc [0][minimumColumn];

সর্বনিম্ন সংখ্যার কলামে সর্বাধিক সংখ্যা খুঁজে বের করার জন্য সর্বপ্রথম উপাদানটি ধরে নেওয়া হয়েছে।
int k = 0;

লুপ চলার জন্য একটি ভেরিয়েবল তৈরি করা হয়েছে যা সারি (row) পরিবর্তনের জন্য ব্যবহৃত হবে।
while (k < 3) {

একটি while লুপ শুরু হয়েছে যা ৩ বার চলবে কারণ আমাদের ৩টি সারি আছে।
if(abc[k][minimumColumn] > max) {

যদি বর্তমান উপাদানটি max এর চেয়ে বড় হয়
max = abc [k][minimumColumn];

যদি শর্তটি সত্য হয় তাহলে বর্তমান উপাদানটি নতুন max হিসেবে ধরে নেয়া হয়।
k++;

লুপের ভেরিয়েবল k এর মান ১ করে বৃদ্ধি করা হচ্ছে যাতে পরের সারির উপাদান চেক করা যায়।
System.out.println(max);

সর্বাধিক সংখ্যাটি প্রিন্ট করা হচ্ছে।
এভাবে, কোডটি প্রথমে সবচেয়ে ছোট সংখ্যার কলাম বের করে এবং তারপর সেই কলামের মধ্যে সর্বোচ্চ সংখ্যাটি খুঁজে বের করে।







 */