public class StatisticSimpleToy {
	private double[] value;
	private double[] frequency;
	private long population = 0;
	
	private double average = 0.0;
	private double std = 0.0;
	private double sum = 0.0;
	private double variance = 0.0;
	private double median = 0.0;
	private double modus = 0.0;
	private double mean = 0.0;
	
	public StatisticSimpleToy(double[] val, double[] freq) {
		this.value = val;
		this.frequency = freq;
		calc();
	}
	
	public double getAverage() {
		return average;
	}
	
	public double getStd() {
		return std;
	}
	
	public double getMean() {
		return mean;
	}
	
	public double getSum() {
		return sum;
	}
	
	public double getMedian() {
		return median;
	}
	
	public double getModus() {
		return modus;
	}
	
	public String toString() {
		String data = "Data \n" + "Value   Frekuensi \n";
		
		for(int i=0; i<value.length; i++) {
			data += value[i] + "      " + frequency[i] + "\n";
		}
		
		data += "\n";
		
		String str = data + 
		             "Hasil       : " + "\n" +
		             "Total       : " + sum + "\n" +
		             "Populasi    : " + population + "\n" +
		             "Rata-rata   : " + average + "\n" +
		             "Std Deviasi : " + std + "\n" +
		             "Variance    : " + variance + "\n";
		             
		             return str;
          }
          
          
          static void test() {
			  double[] value = {50, 60, 70, 80, 90 };
			  double[] frequency = {3, 5, 10, 6, 2 };
			  
			  System.out.println(new StatisticSimpleToy(value, frequency));
		  }
		  
		  
		  public static void main(String[] args) {
			  test();
		  }
		  
		  private void calc() {
			  calcSum_Average() ;
			  calcStd_Variance();
		  }
		  
		  private void calcSum_Average() {
			  for (int i = 0 ; i < value.length; i++) {
				  sum += (value[i] * frequency[i]) ;
				  population += frequency[i];
			  }
			  
			  average = sum/population;
		  }
		  
		  private void calcStd_Variance() {
			  double sumOfSquare = 0.0;
			  for(int i = 0; i < value.length; i++) {
				  sumOfSquare += frequency[i] * (value[i] - average) * (value[i] - average);
			  }
			  
			  variance = sumOfSquare/value.length;
			  std = Math.sqrt(sumOfSquare/value.length);
		  }
	  }
	  
				  
