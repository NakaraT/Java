package ru.mirea.task12.number2;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.mark - s2.mark;
    }
    public void Sort(Student[] s, int left, int right)
    {
        int leftMarker = left;
        int rightMarker = right;
        Student pivot = s[(leftMarker + rightMarker) / 2];
        do {
            while (compare(s[leftMarker],pivot)>0) {
                leftMarker++;
            }
            while (compare(s[rightMarker],pivot) <0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = s[leftMarker];
                    s[leftMarker] = s[rightMarker];
                    s[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < right) {
            Sort(s, leftMarker, right);
        }
        if (left < rightMarker) {
            Sort(s, left, rightMarker);
        }
    }
}
