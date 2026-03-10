Problem Statements: Duplicate Detection 
You are given a file containing 100 million email addresses. Some emails may appear multiple times. Design a solution to find all duplicate emails efficiently.

Algorithm:
Read emails one by one from the file.
Store each email in a HashSet called seen.
If an email already exists in the set → it is a duplicate.
Store duplicates in another set called duplicates.
Approach:

We read each email from the file and store it in a HashSet.
If the email already exists in the set, it is identified as a duplicate.

Data Structures:
HashSet is used for fast lookup.
Time Complexity: O(n) and
Space Complexity: O(n)
