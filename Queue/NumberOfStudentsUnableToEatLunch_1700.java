
// 1700. Number Of Students Unable To Eat Lunch

// The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.



class NumberOfStudentsUnableToEatLunch_1700 {
    public int countStudents(int[] students, int[] sandwiches) {
       int[] counts = new int[2];
        for (int student : students) counts[student]++;
        
        int remaining = sandwiches.length;
        for (int sandwich : sandwiches) {
            if (counts[sandwich] == 0) break;
            if (remaining-- == 0) break;
            counts[sandwich]--;
        }
        
        return remaining; 
    }
}