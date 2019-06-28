package com.hpe.view;


import java.awt.Font;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

@SuppressWarnings("serial")
public class ChartBuilder extends JFrame {
    static String title;
    static List<ProductSale> list;//数据集合
    public ChartBuilder(String title,List list) {
        super(title);
        this.title = title;
        this.list = list;
        //设置关闭方式为销毁当前窗体
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setContentPane(createPanel()); //将生成的图表面板设为内容面板
      
    }

    private static CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
          for(ProductSale ps : list){
              //图表数据，名称，横坐标
              dataset.addValue(ps.getFirstmonth(), ps.getPname(),"1月");
              dataset.addValue(ps.getSecondmonth(), ps.getPname(),"2月");
              dataset.addValue(ps.getThirdmonth(), ps.getPname(),"3月");
          }
        return dataset;
    }

    private static JFreeChart createJFreeChart(CategoryDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //生成柱状图
        JFreeChart jfreeChart = ChartFactory.createBarChart3D(title,
                "图例", "销售总金额", dataset, PlotOrientation.VERTICAL, true, false,false);
        /**
         * 设置JFreeChart的属性
         */
        jfreeChart.setTitle(new TextTitle(title, new Font("宋体", Font.BOLD
                + Font.ITALIC, 20)));
        CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
        CategoryAxis categoryAxis = plot.getDomainAxis();
        categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 12));

        return jfreeChart;
    }

    public static JPanel createPanel() {
        // 生成JFreeChart对象(依据数据生成图表)
        JFreeChart chart = createJFreeChart(createDataSet());
        // 将JFreeChar对象转成JPanel
        return new ChartPanel(chart);
    }
}
