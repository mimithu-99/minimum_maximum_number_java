package VideoPractice01;

public class MinimumColumnNumber {
    public static void main(String[] args) {
        int abc [][] = {
                {2,4,5},
                {3,0,7},
                {1,2,9}

        };
        int minimumNumber = abc [0][0];
        int minimumColumn;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(abc[i][j] < minimumNumber){
                    minimumNumber = abc[1][j];
                    minimumColumn = j;

                }
            }

        }
        System.out.println(minimumNumber);
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
আশা করি এখন তুমি প্রতিটি লাইনের কাজ আরও ভালোভাবে বুঝতে পারছ। এটি একটি ২-ডি অ্যারে থেকে একটি নির্দিষ্ট কলাম (যেখানে সবচেয়ে ছোট সংখ্যা আছে) থেকে সবচেয়ে বড় সংখ্যা খুঁজে বের করার প্রোগ্রাম।
 */
/*

public class MinimumColumnNumber {
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
        int minimumColumn;

        // বাইরের লুপটি সারির (row) জন্য
        for (int i = 0; i < 3; i++) {
            // ভিতরের লুপটি কলামের (column) জন্য
            for (int j = 0; j < 3; j++) {
                // যদি বর্তমান উপাদানটি (element) minimumNumber এর চেয়ে ছোট হয়
                if(abc[i][j] < minimumNumber){
                    // তাহলে সেটিকে minimumNumber হিসেবে ধরে নাও
                    minimumNumber = abc[i][j];
                    // এবং কলামের নম্বরটি ধরে নাও (এটি পরে প্রয়োজন হতে পারে)
                    minimumColumn = j;
                }
            }
        }
        // সর্বনিম্ন সংখ্যাটি প্রিন্ট করা হচ্ছে
        System.out.println(minimumNumber);
    }
}
এখন প্রতিটি লাইনের কাজ সহজ ভাষায়:

public class MinimumColumnNumber {

এই লাইনটি একটি নতুন ক্লাস তৈরি করছে যার নাম MinimumColumnNumber।
public static void main(String[] args) {

এই লাইনটি প্রধান মেথড main ঘোষণা করছে যা প্রোগ্রাম শুরু হওয়ার স্থান।
int abc [][] = { ... };

এটি একটি 2D অ্যারে তৈরি করছে এবং সেটির মধ্যে ৩টি সারি এবং ৩টি কলাম দিয়ে পূর্ণ করছে।
int minimumNumber = abc [0][0];

এই লাইনটি প্রথম উপাদানটিকে সর্বনিম্ন সংখ্যা হিসেবে ধরে নিচ্ছে।
int minimumColumn;

এই লাইনটি একটি ভেরিয়েবল তৈরি করছে যা সর্বনিম্ন সংখ্যার কলামের নম্বর সংরক্ষণ করবে।
for (int i = 0; i < 3; i++) {

এটি বাইরের লুপ যা সারি (row) গুলি নিয়ে কাজ করবে। এটি ৩ বার চলবে কারণ আমাদের ৩টি সারি আছে।
for (int j = 0; j < 3; j++) {

এটি ভিতরের লুপ যা কলাম (column) গুলি নিয়ে কাজ করবে। এটি ৩ বার চলবে কারণ আমাদের ৩টি কলাম আছে।
if(abc[i][j] < minimumNumber){

এই শর্তটি চেক করে যদি বর্তমান উপাদানটি (abc[i][j]) সর্বনিম্ন সংখ্যার চেয়ে ছোট হয়।
minimumNumber = abc[i][j];

যদি শর্তটি সত্য হয় তাহলে বর্তমান উপাদানটি নতুন সর্বনিম্ন সংখ্যা হিসেবে ধরে নেয়া হয়।
minimumColumn = j;

এবং বর্তমান কলামের নম্বরটি সর্বনিম্ন সংখ্যার কলাম হিসেবে ধরে নেয়া হয়।
System.out.println(minimumNumber);

সর্বনিম্ন সংখ্যাটি প্রিন্ট করে।






 */