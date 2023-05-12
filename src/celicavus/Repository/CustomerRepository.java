package celicavus.Repository;
import celilcavus.Interfaces.*;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import celilcavus.Context.Context;
import celilcavus.Entitys.*;



public class CustomerRepository implements GenericRepository<Customer>{
	
	private Context context;
	private SimpleDateFormat simple = new SimpleDateFormat();
	private Date date = new Date();
	private final String NowDate = simple.format(date);
	
	private PreparedStatement pre = null;
	public CustomerRepository() {
		// TODO Auto-generated constructor stub
		context = new Context();
	}
	
	
	@Override
	public void Add(Customer item) {
		String query = "INSERT INTO customer (Name, LastName, Tc, TelNo, Adress, AtmNo, Bakiye, create_date, update_date)"
				+ "values  (?,?,?,?,?,?,?,?,?)";
		
		try {
			
			pre = context.conn.prepareStatement(query);
			pre.setString(1, item.Name);
			pre.setString(2, item.LastName);
			pre.setString(3,item.Tc);
			pre.setString(4, item.TelNo);
			pre.setString(5, item.Adress);
			pre.setString(6, item.AtmNo);
			pre.setDouble(7, item.Bakiye);
			pre.setString(8, NowDate);
			pre.setString(9, NowDate);
			int kontrol = 	pre.executeUpdate();
			if(kontrol>= 1)
			{
				System.out.println("Insert işlemi Basarili "+ NowDate);
			}
			else {
				System.out.println("Insert işlemi Basarili " + NowDate);
			}
		}catch(Exception ex)
		{
			System.out.println("Customer Repository Add Ex == " + ex.getMessage());
		}
		
		
	}

	@Override
	public void Update(Customer item) {
		String query = "UPDATE customer SET Name = ?, LastName = ?, Tc = ?, TelNo = ?, Adress = ?, AtmNo = ?, Bakiye = ?,  update_date = ?)"
				+ "where customerId = ?";
		
		try {
			
			pre = context.conn.prepareStatement(query);
			pre.setString(1, item.Name);
			pre.setString(2, item.LastName);
			pre.setString(3,item.Tc);
			pre.setString(4, item.TelNo);
			pre.setString(5, item.Adress);
			pre.setString(6, item.AtmNo);
			pre.setDouble(7, item.Bakiye);
			pre.setString(8, NowDate);
			pre.setInt(9, item.Id);
			int kontrol = 	pre.executeUpdate();
			if(kontrol>= 1)
			{
				System.out.println("Insert işlemi Basarili "+ NowDate);
			}
			else {
				System.out.println("Insert işlemi Basarili " + NowDate);
			}
		}catch(Exception ex)
		{
			System.out.println("Customer Repository Add Ex == " + ex.getMessage());
		}
		
		
	}

	@Override
	public void Delete(Customer item) {
		String query = "DELETE FROM customer where customerId = ?";
		
		try {
			
			pre = context.conn.prepareStatement(query);
			pre.setInt(1, item.Id);
			int kontrol = 	pre.executeUpdate();
			if(kontrol>= 1)
			{
				System.out.println("Delete işlemi Basarili "+ NowDate);
			}
			else {
				System.out.println("Delete işlemi Basarili " + NowDate);
			}
		}catch(Exception ex)
		{
			System.out.println("Customer Repository Add Ex == " + ex.getMessage());
		}
		
	}

	@Override
	public List<Customer> GetAll() {
		List<Customer> list = new ArrayList<>();
		try {
			context.set =  context.state.executeQuery("SELECT * FROM customer");
			while(context.set.next())
			{
				Customer custom = new Customer();
				custom.Name = context.set.getString("Name");
				custom.LastName = context.set.getString("LastName");
				custom.Tc = context.set.getString("Tc");
				custom.Adress = context.set.getString("Adress");
				custom.AtmNo = context.set.getString("AtmNo");
				custom.Bakiye = Double.parseDouble(context.set.getString("Bakiye"));
				custom.create_date = context.set.getString("create_date");
				custom.update_date = context.set.getString("update_date");
				list.add(custom);
			}
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public Customer GetById(int id) {
		Customer custom = new Customer();
		try {
			context.set =  context.state.executeQuery("SELECT * FROM customer where customerId = " + id);
			while(context.set.first())
			{
				
				custom.Name = context.set.getString("Name");
				custom.LastName = context.set.getString("LastName");
				custom.Tc = context.set.getString("Tc");
				custom.Adress = context.set.getString("Adress");
				custom.AtmNo = context.set.getString("AtmNo");
				custom.Bakiye = Double.parseDouble(context.set.getString("Bakiye"));
				custom.create_date = context.set.getString("create_date");
				custom.update_date = context.set.getString("update_date");
			}
			return custom;
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
