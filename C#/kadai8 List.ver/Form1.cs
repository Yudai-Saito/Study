using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Sales;

namespace GuiApp02
{
    public partial class Form1 : Form
    {
        private List<SalesDetail> sales_array = new List<SalesDetail>();
        private List<Product> products_array = new List<Product>();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            long price = Convert.ToInt64(textBox3.Text);

            foreach(Product product in this.products_array)
            {
                if(Convert.ToInt32(textBox1.Text) == product.GetNo())
                {
                    MessageBox.Show("既に登録されている商品です。");
                    return;
                }
            }

            if (price < 0){
                MessageBox.Show("値は0以上です。", "エラー");
            }
            else if(price >= 10000000)
            {
                MessageBox.Show("値は9999999以下です。", "エラー");
            }
            else
            {
                Product product = new Product();
                product.SetNo(Convert.ToInt32(textBox1.Text));
                product.SetName(textBox2.Text);
                product.SetPrice(price);
                this.products_array.Add(product);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int quantity = Convert.ToInt32(textBox5.Text);
            foreach (Product product in this.products_array) 
            {
                if (product.GetNo() == Convert.ToInt32(textBox4.Text))
                {
                    if (quantity < 0)
                    {
                        MessageBox.Show("個数は0以上999以下です。", "エラー");
                    }
                    else if (quantity > 999)
                    {
                        MessageBoxButtons buttons = MessageBoxButtons.YesNo;
                        DialogResult result = MessageBox.Show("1000以上ですが登録しますか？", "警告", buttons);
                        if (result == DialogResult.Yes)
                        {
                            SalesDetail sales = new SalesDetail(Convert.ToInt32(textBox4.Text), Convert.ToInt32(textBox5.Text));
                            this.sales_array.Add(sales);
                            return;
                        }
                    }
                    else
                    {
                        SalesDetail sales = new SalesDetail(Convert.ToInt32(textBox4.Text), Convert.ToInt32(textBox5.Text));
                        this.sales_array.Add(sales);
                        return;
                    }
                }
            }
            MessageBox.Show("商品が存在しません。");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (sales_array.Count == 0)
            {
                MessageBox.Show("販売情報が存在しません。", "エラー");
            }
            else
            {
                long all = 0;
                foreach(Product product in this.products_array)
                {
                    for(int i = 0; this.sales_array.Count > i; i++)
                    {
                        if (product.GetNo() == this.sales_array[i].GetProductNo())
                        {
                            all += product.GerPrice() * this.sales_array[i].GetQuantity();
                        }
                    }
                }
                label6.Text = String.Format("{0:###0}円", all);
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
