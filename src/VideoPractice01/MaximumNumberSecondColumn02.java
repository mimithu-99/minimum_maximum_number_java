package VideoPractice01;

public class MaximumNumberSecondColumn02 {
    public static void main(String[] args) {
        int abc [][] = {
                {2,4,5},
                {3,0,10},
                {1,10,9}
        };
        int minimumNumber = abc[0][0];
        int minimumColumn = 0;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if(abc[row][column] < minimumNumber)
                {
                    minimumNumber = abc[row][column];
                    minimumColumn = column;
                }

            }

        }
        int maximumNumber = abc[0][minimumColumn];
        int k = 0;
        while (k < 3){
            if(abc[k][minimumColumn] > maximumNumber){
                maximumNumber = abc[k][minimumColumn];
            }
            k++;
        }
 System.out.println("Maximum number is: " +maximumNumber);
    }
}

/*
public class MaximumNumberSecondColumn02 { // এই লাইনটি একটি ক্লাস (প্রোগ্রামের একটি অংশ) শুরু করে, যার নাম MaximumNumberSecondColumn02
    public static void main(String[] args) { // এই লাইনটি প্রোগ্রামের মূল অংশ শুরু করে, যেখানে সবকিছু ঘটে
        int abc [][] = { // এটি একটি ২-ডি (দুই মাত্রার) অ্যারে তৈরি করে, যেটি সংখ্যার একটি টেবিলের মত
                {2,4,5},  // প্রথম সারি
                {3,0,10}, // দ্বিতীয় সারি
                {1,10,9}  // তৃতীয় সারি
        };
        int minimumNumber = abc[0][0]; // প্রথম উপাদানকে (2) ধরে নেয় যে এটা সবচেয়ে ছোট সংখ্যা
        int minimumColumn = 0; // ধরে নেয় যে সবচেয়ে ছোট সংখ্যা প্রথম কলামে আছে (কলাম ০)
        for (int row = 0; row < 3; row++) { // সারি ধরে ধরে (0 থেকে 2 পর্যন্ত) লুপ করে
            for (int column = 0; column < 3; column++) { // প্রতিটি সারিতে কলাম ধরে ধরে (0 থেকে 2 পর্যন্ত) লুপ করে
                if(abc[row][column] < minimumNumber) // যদি কোনও সংখ্যাটি বর্তমান সবচেয়ে ছোট সংখ্যার (minimumNumber) থেকে ছোট হয়
                {
                    minimumNumber = abc[row][column]; // তাহলে সেটিকে নতুন সবচেয়ে ছোট সংখ্যা হিসেবে ধরে নেয়
                    minimumColumn = column; // এবং তার কলামের ইনডেক্স (নম্বর) ধরে নেয়
                }
            }
        }
        // এখন minimumNumber হলো সবচেয়ে ছোট সংখ্যা এবং minimumColumn হলো সেই সংখ্যার কলাম ইনডেক্স
        int maximumNumber = abc[0][minimumColumn]; // সেই কলামে প্রথম উপাদানকে (যেখানে সবচেয়ে ছোট সংখ্যা পাওয়া গেছে) সবচেয়ে বড় সংখ্যা ধরে নেয়
        int k = 0; // একটি কাউন্টার (গণক) হিসেবে k কে ০ দিয়ে শুরু করে
        while (k < 3){ // এই লুপটি চলবে যতক্ষণ k এর মান ৩ এর কম থাকে (০ থেকে ২ পর্যন্ত)
            if(abc[k][minimumColumn] > maximumNumber){ // যদি সেই কলামে কোনও উপাদান বর্তমান সবচেয়ে বড় সংখ্যার (maximumNumber) থেকে বড় হয়
                maximumNumber = abc[k][minimumColumn]; // তাহলে সেটিকে নতুন সবচেয়ে বড় সংখ্যা হিসেবে ধরে নেয়
            }
            k++; // k এর মান ১ বাড়িয়ে দেয়, যেন লুপটি পরবর্তী সারিতে চলে যায়
        }
        // লুপ শেষ হলে, maximumNumber হলো সেই কলামে সবচেয়ে বড় সংখ্যা
        System.out.println("Maximum number is: " + maximumNumber); // সবচেয়ে বড় সংখ্যাটি প্রিন্ট করে (দেখায়)
    }
}

 */

/*
public class MaximumNumberSecondColumn02 {
    public static void main(String[] args) {
        // 2D অ্যারে তৈরি করা হয়েছে যেখানে ৩টি সারি (row) এবং ৩টি কলাম (column) আছে
        int abc [][] = {
                {2,4,5},
                {3,0,10},
                {1,10,9}
        };

        // সর্বনিম্ন সংখ্যাটি ধরে রাখার জন্য প্রথম উপাদান (element) গ্রহণ করা হয়েছে
        int minimumNumber = abc[0][0];

        // সর্বনিম্ন সংখ্যাটি কোন কলামে আছে তা খুঁজে বের করার জন্য একটি ভেরিয়েবল ঘোষণা করা হয়েছে
        int minimumColumn = 0;

        // বাইরের লুপটি সারির (row) জন্য
        for (int row = 0; row < 3; row++) {
            // ভিতরের লুপটি কলামের (column) জন্য
            for (int column = 0; column < 3; column++) {
                // যদি বর্তমান উপাদানটি (element) minimumNumber এর চেয়ে ছোট হয়
                if(abc[row][column] < minimumNumber) {
                    // তাহলে সেটিকে minimumNumber হিসেবে ধরে নাও
                    minimumNumber = abc[row][column];
                    // এবং কলামের নম্বরটি ধরে নাও (এটি পরে প্রয়োজন হতে পারে)
                    minimumColumn = column;
                }
            }
        }

        // সর্বনিম্ন সংখ্যার কলামে সর্বাধিক সংখ্যা খুঁজে বের করার জন্য সর্বপ্রথম উপাদানটি ধরে নেওয়া হয়েছে
        int maximumNumber = abc[0][minimumColumn];
        int k = 0;

        // while লুপ ব্যবহার করে প্রতিটি সারির উপাদান চেক করা হবে
        while (k < 3) {
            // যদি বর্তমান উপাদানটি maximumNumber এর চেয়ে বড় হয়
            if(abc[k][minimumColumn] > maximumNumber) {
                // তাহলে সেটিকে maximumNumber হিসেবে ধরে নাও
                maximumNumber = abc[k][minimumColumn];
            }
            k++;
        }

        // সর্বাধিক সংখ্যাটি প্রিন্ট করা হচ্ছে
        System.out.println("Maximum number is: " + maximumNumber);
    }
}
এখন প্রতিটি লাইনের কাজ সহজ ভাষায়:

public class MaximumNumberSecondColumn02 {

এই লাইনটি একটি নতুন ক্লাস তৈরি করছে যার নাম MaximumNumberSecondColumn02।
public static void main(String[] args) {

এই লাইনটি প্রধান মেথড main ঘোষণা করছে যা প্রোগ্রাম শুরু হওয়ার স্থান।
int abc [][] = { ... };

এটি একটি 2D অ্যারে তৈরি করছে এবং সেটির মধ্যে ৩টি সারি এবং ৩টি কলাম দিয়ে পূর্ণ করছে।
int minimumNumber = abc[0][0];

এই লাইনটি প্রথম উপাদানটিকে সর্বনিম্ন সংখ্যা হিসেবে ধরে নিচ্ছে।
int minimumColumn = 0;

এই লাইনটি একটি ভেরিয়েবল তৈরি করছে যা সর্বনিম্ন সংখ্যার কলামের নম্বর সংরক্ষণ করবে।
for (int row = 0; row < 3; row++) {

এটি বাইরের লুপ যা সারি (row) গুলি নিয়ে কাজ করবে। এটি ৩ বার চলবে কারণ আমাদের ৩টি সারি আছে।
for (int column = 0; column < 3; column++) {

এটি ভিতরের লুপ যা কলাম (column) গুলি নিয়ে কাজ করবে। এটি ৩ বার চলবে কারণ আমাদের ৩টি কলাম আছে।
if(abc[row][column] < minimumNumber) {

এই শর্তটি চেক করে যদি বর্তমান উপাদানটি (abc[row][column]) সর্বনিম্ন সংখ্যার চেয়ে ছোট হয়।
minimumNumber = abc[row][column];

যদি শর্তটি সত্য হয় তাহলে বর্তমান উপাদানটি নতুন সর্বনিম্ন সংখ্যা হিসেবে ধরে নেয়া হয়।
minimumColumn = column;

এবং বর্তমান কলামের নম্বরটি সর্বনিম্ন সংখ্যার কলাম হিসেবে ধরে নেয়া হয়।
int maximumNumber = abc[0][minimumColumn];

সর্বনিম্ন সংখ্যার কলামে সর্বাধিক সংখ্যা খুঁজে বের করার জন্য সর্বপ্রথম উপাদানটি ধরে নেওয়া হয়েছে।
int k = 0;

লুপ চলার জন্য একটি ভেরিয়েবল তৈরি করা হয়েছে যা সারি (row) পরিবর্তনের জন্য ব্যবহৃত হবে।
while (k < 3) {

একটি while লুপ শুরু হয়েছে যা ৩ বার চলবে কারণ আমাদের ৩টি সারি আছে।
if(abc[k][minimumColumn] > maximumNumber) {

যদি বর্তমান উপাদানটি maximumNumber এর চেয়ে বড় হয়
maximumNumber = abc[k][minimumColumn];

যদি শর্তটি সত্য হয় তাহলে বর্তমান উপাদানটি নতুন maximumNumber হিসেবে ধরে নেয়া হয়।
k++;

লুপের ভেরিয়েবল k এর মান ১ করে বৃদ্ধি করা হচ্ছে যাতে পরের সারির উপাদান চেক করা যায়।
System.out.println("Maximum number is: " + maximumNumber);

সর্বাধিক সংখ্যাটি প্রিন্ট করা হচ্ছে।
এভাবে, কোডটি প্রথমে সবচেয়ে ছোট সংখ্যার কলাম বের করে এবং তারপর সেই কলামের মধ্যে সর্বোচ্চ সংখ্যাটি খুঁজে বের করে।







 */