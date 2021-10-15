using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GuiAppForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        
        public void setLabel(String label1, String label2)
        {
            this.label1.Text = label1;
            this.label2.Text = label2;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();
            form2.addSelectList(textBox1.Text, textBox2.Text);
            form2.ShowDialog();
            label1.Text = form2.SelectedKey;
            label2.Text = form2.SelectedValue;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form3 form3 = new Form3();
            form3.Owner = this;
            form3.addComboList(textBox1.Text, textBox2.Text);
            form3.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Form4 form4 = new Form4();
            form4.ShowDialog();
        }
    }
}
