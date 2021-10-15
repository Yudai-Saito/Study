using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GuiApp01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int price = Convert.ToInt32(textBox1.Text);
            int quantity = Convert.ToInt32(textBox2.Text);
            double tax = Convert.ToInt32(textBox3.Text) * 0.01;
            label8.Text = String.Format("{0:#,##0}円", price * quantity);
            label7.Text = String.Format("{0:#,##0}円", ((price + price * tax) * quantity - (price * quantity)));
            label6.Text = String.Format("{0:#,##0}円", (price + price * tax) * quantity);
        }
    }
}
