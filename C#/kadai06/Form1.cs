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
        private Product product;
        private SalesDetail sales;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            long price = Convert.ToInt64(textBox3.Text);
            if (price < 0){
                MessageBox.Show("値は0以上です。", "エラー");
            }
            else if(price >= 10000000)
            {
                MessageBox.Show("値は9999999以下です。", "エラー");
            }
            else
            {
                this.product = new Product();
                this.product.SetNo(Convert.ToInt32(textBox1.Text));
                this.product.SetName(textBox2.Text);
                this.product.SetPrice(price);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int quantity = Convert.ToInt32(textBox5.Text);

            if (this.product.GetNo() == Convert.ToInt32(textBox4.Text))
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
                        this.sales = new SalesDetail(Convert.ToInt32(textBox4.Text), Convert.ToInt32(textBox5.Text));
                    }
                }
                else
                {
                    this.sales = new SalesDetail(Convert.ToInt32(textBox4.Text), Convert.ToInt32(textBox5.Text));
                }
            }
            else 
            {
                MessageBox.Show("商品が存在しません。", "エラー");

            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (this.sales == null)
            {
                MessageBox.Show("販売情報が存在しません。", "エラー");
            }
            else
            {
                label6.Text = String.Format("{0:#,##0}円", Convert.ToInt32(this.product.GerPrice()) * Convert.ToInt32(this.sales.GetQuantity()));
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
