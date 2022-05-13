package ru.netology.stats;

public class StatsService {

    public long totalSale(long[] sales) {

        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSale(long[] sales) {

        StatsService service = new StatsService();

        long total = service.totalSale(sales);
        long average = total / sales.length;
        return average;
    }

    //    public long monthMaxSale(long[] sales) {
//
//        int month = 0;
//        for (int i = 1; i < sales.length; i++) {
//            if (sales[i] >= sales[month]) {
//                month = i;
//            }
//        }
//        return (month + 1);
//    }
//
    public long monthMaxSale(long[] sales) {

        int index = 0;
        int monthMaxSale = 0;
        for (long sale : sales) {
            if (sale >= sales[monthMaxSale]) {
                monthMaxSale = index;
            }
            index += 1;
        }
        return (monthMaxSale + 1);
    }

    public long monthMinSale(long[] sales) {

        int index = 0;
        int monthMinSale = 0;
        for (long sale : sales) {
            if (sale <= sales[monthMinSale]) {
                monthMinSale = index;
            }
            index += 1;
        }
        return (monthMinSale + 1);
    }

    public long monthsLowerAverageSale(long[] sales) {

        StatsService service = new StatsService();

        long average = service.averageSale(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count += 1;
            }
        }
        return count;
    }

    public long monthsHigherAverageSale(long[] sales) {

        StatsService service = new StatsService();

        long average = service.averageSale(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count += 1;
            }
        }
        return count;
    }
}