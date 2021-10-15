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
    public partial class Form4 : Form
    {
        bool userControlFlg = true;
        public Form4()
        {
            InitializeComponent();
            userControl11.Visible = true;
            userControl21.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (userControlFlg)
            {
                userControl11.Enabled = false;
            }
            else
            {
                userControl21.Enabled = false;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            userControl11.Enabled = true;
            userControl21.Enabled = true;
            if (userControlFlg)
            {
                userControl11.Visible = false;
                userControl21.Visible = true;
                userControlFlg = false;
            }
            else
            {
                userControl11.Visible = true;
                userControl21.Visible = false;
                userControlFlg = true;
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
