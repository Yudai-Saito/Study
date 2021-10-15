using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using GuiApp02.sales;

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
            this.product = new Product();
            this.product.SetNo(Convert.ToInt32(textBox1.Text));
            this.product.SetName(textBox2.Text);
            this.product.SetPrice(Convert.ToInt32(textBox3.Text));
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.sales = new SalesDetail(Convert.ToInt32(textBox4.Text), Convert.ToInt32(textBox5.Text));
        }

        private void button3_Click(object sender, EventArgs e)
        {
            label6.Text = String.Format("{0:###0円}", Convert.ToInt32(this.product.GerPrice()) * Convert.ToInt32(this.sales.GetQuantity()));
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
