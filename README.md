# Втора лабораториска вежба по Софтверско инженерство
# Ангела Јовановска, 203147
 Control Flow Graph

![image](https://user-images.githubusercontent.com/77406552/170779552-86266df6-b0c8-4fb7-84fb-21545a687c7c.png)


 Цикломатска комплексност
 
 Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1,
 каде што P е бројот на предикатни јазли. Во случајoв P=8, па цикломатската комплексност изнесува 9. Предикатни јазли: 10, 15, 19.2, 20, 21&22, 23, 30, 33.
 
 
Тест случаи според критериумот Every statement и Every branch

     @Test
    void everyStatementAndBranch() {
        IllegalArgumentException exception;
        exception = assertThrowsExactly(IllegalArgumentException.class,
                () -> {
            SILab2.function(createList());
        });
        assertTrue(exception.getMessage().equals("List length should be greater than 0"));

        exception = assertThrowsExactly(IllegalArgumentException.class,
                () -> {
            SILab2.function(createList("1","2","3","4","#"));
        });
        assertTrue(exception.getMessage().equals("List length should be a perfect square"));

        assertArrayEquals(SILab2.function(createList("#", "1", "1", "#", "2", "#", "1", "#", "1")).toArray(), createList(
                "#",
                "1",
                "1",
                "#",
                "3",
                "#",
                "2",
                "#",
                "2").toArray());
    }
    
   Објаснување на напишаните unit tests
   
   Вкупно имаме 3 тестови. 
   
   Првиот тест за Exception: List length should be greater than 0 и вториот тест за Exception: List length should be a perfect square. Во функцијата everyStatementAndBranch() и методота assertThrowsExactly се тестираат линиите 10, 11, 15, 16 бидејќи фрлаат исклучок и со методата assertTrue се проверува дали е фатен соодветниот исклучок. Третиот тест случај кој ги опфати сите statements и branches. Наместо assertEquals тука ја искористив assertArrayEquals којашто метода нуди директна компарација на две листи.
