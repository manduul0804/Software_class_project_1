/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author akatsuki
 */
import java.io.File;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;  
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import java.util.*;
import java.util.Map.Entry;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader {
    
    public void getExcel(String loc) throws IOException, InvalidFormatException{
        
        Map<Integer,List<String>>  exFile = new HashMap<Integer, List<String>>();
        
        
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);
        String fileLoc = (loc + ".xls");
        System.out.println("Openning file " + fileLoc);
            
        Workbook wb = WorkbookFactory.create(new File(fileLoc));
        int rowNum = 0;
        Sheet sheet = wb.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();
        Iterator<Row> rowIterator= sheet.rowIterator();
        while(rowIterator.hasNext()){
            List<String> ar = new ArrayList<String>();
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while(cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                ar.add(cellValue);
            }           
            exFile.put(rowNum,ar);
            rowNum++;
        }
        Map<String,Student> exStudent = new TreeMap<String, Student>();
        for(int i=1; i < exFile.size(); i++){
            int count = 0;
            String emailStudent = new String();
            Student exStudentClass = new Student();
            Student.Course course = exStudentClass.new Course();
            for(String j: exFile.get(i)){
                if(count == 0){
                   exStudentClass.setfName(j);
                }else if(count == 1){
                    exStudentClass.setlName(j);
                }else if(count == 2){
                    emailStudent = j;
                }else if(count == 3){
                    exStudentClass.setPass(parseInt(j));
                }else if(count == 4){
                    exStudentClass.addCourse(j, course);
                }else if(count == 5){
                    course.setGPA(parseDouble(j));
                }
                count++;
            }
            exStudent.put(emailStudent, exStudentClass);
        }
        Main_login_frame.student_hash.putAll(exStudent);
        for(Map.Entry<Integer, List<String>> entry: exFile.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            
            for(String i: entry.getValue()){
                System.out.println(i);
            }
        }
        wb.close();
//        getCourse("Grade_table");
        
    }
    
    public void getCourse(String loc1) throws IOException, InvalidFormatException{

            Map<Integer,List<String>>  exFile = new HashMap<Integer, List<String>>();


            String userDirectory = System.getProperty("user.dir");
            System.out.println(userDirectory);
            String fileLoc = (loc1 + ".xls");
            System.out.println("Openning file " + fileLoc);

            Workbook wb = WorkbookFactory.create(new File(fileLoc));
            int rowNum = 0;
            Sheet sheet = wb.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();
            Iterator<Row> rowIterator= sheet.rowIterator();
            while(rowIterator.hasNext()){
                List<String> ar = new ArrayList<String>();
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    String cellValue = dataFormatter.formatCellValue(cell);
                    ar.add(cellValue);
                }           
                exFile.put(rowNum,ar);
                rowNum++;
            }
            Map<String,Student> exStudent = new TreeMap<String, Student>();
            for(int i=1; i < exFile.size(); i++){
                int count = 0;
                String emailStudent = new String();
                Student exStudentClass = new Student();
                Student.Course course = exStudentClass.new Course();
                for(String j: exFile.get(i)){
                    if(count == 0){
                       emailStudent = j;
                    }else if(count == 1){
                        exStudentClass.addCourse(j, course);
                    }else if(count == 2){
                        course.setQuizAve(parseInt(j));
                    }else if(count == 3){
                        course.setFinalExam(parseInt(j));
                    }else if(count == 4){
                        course.setGPA(parseDouble(j));
                    }
                    count++;
                }
                exStudent.put(emailStudent, exStudentClass);
            }
            Main_login_frame.student_hash.putAll(exStudent);
            for(Map.Entry<Integer, List<String>> entry: exFile.entrySet()){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());

                for(String i: entry.getValue()){
                    System.out.println(i);
                }
            }
            wb.close();

        }   
    
}
