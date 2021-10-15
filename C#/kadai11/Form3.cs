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
    public partial class Form3 : Form
    {

        private BindingList<KeyValuePair<String, String>> comboList = new BindingList<KeyValuePair<string, string>>();
        private String selectedKey;
        private String selectedValue;

        public Form3()
        {
            InitializeComponent();
            KeyValuePair<String, String> kvp1 = new KeyValuePair<string, string>("001", "項目A");
            KeyValuePair<String, String> kvp2 = new KeyValuePair<string, string>("002", "項目B");
            KeyValuePair<String, String> kvp3 = new KeyValuePair<string, string>("003", "項目C");
            comboList.Add(kvp1);
            comboList.Add(kvp2);
            comboList.Add(kvp3);
            comboBox1.DisplayMember = "value";
            comboBox1.ValueMember = "key";

            comboBox1.DataSource = comboList;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(comboBox1.SelectedIndex >= 0)
            {
                selectedKey = comboBox1.SelectedValue.ToString();
                selectedValue = ((KeyValuePair<String, String>)comboBox1.SelectedItem).Value;
                Form1 form1 = (Form1)this.Owner;
                form1.setLabel(selectedKey, selectedValue);
            }
            this.Close();
        }

        public String SelectedKey
        {
            get { return selectedKey; }
        }

        public String SelectedValue
        {
            get { return selectedValue; }
        }

        public void addComboList(String key, String value)
        {
            KeyValuePair<String, String> kvp = new KeyValuePair<string, string>(key, value);
            comboList.Add(kvp);
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
