package ru.mirea.task30;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import static org.junit.Assert.*;


public class IPCheckTest {
    static boolean CheckIpTest = false;
    @Test
    public void CheckIp() {
        assertTrue(IP.CheckIp("127.0.0.1"));
        assertTrue(IP.CheckIp("255.255.255.0"));
        assertFalse(IP.CheckIp("1300.6.7.8"));
        assertFalse(IP.CheckIp("abc.def.gha.bcd"));
        CheckIpTest = true;
        writeCheckIPTestResults();
    }

    static void writeCheckIPTestResults() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Vyacheslav\\IdeaProjects\\Java\\src\\ru\\mirea\\task31\\CheckIPTestsResults.md");
            fw.write("Test results =>\n");
            fw.write("Test CheckIp()\n");
            if (IPCheckTest.CheckIpTest) {
                fw.write("The tests were successful.\n");
            }
            else {
                fw.write("Tests failed...\n");
            }
            System.out.println("The results have been recorded successfully!");
            fw.flush();
        }
        catch (IOException e) {
            System.out.println("Error => \n" + e.getMessage());
        }

    }
}
