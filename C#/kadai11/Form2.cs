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
    public partial class Form2 : Form
    {
        //リストボックス用の項目を用意
        private BindingList<KeyValuePair<String, String>> selectList = new BindingList<KeyValuePair<string, string>>();
        private String selectedKey;
        private String selectedValue;

        public Form2()
        {
            //フォームの初期化
            InitializeComponent();
            KeyValuePair<String, String> kvp1 = new KeyValuePair<string, string>("001", "項目A");
            KeyValuePair<String, String> kvp2 = new KeyValuePair<string, string>("002", "項目B");
            KeyValuePair<String, String> kvp3 = new KeyValuePair<string, string>("003", "項目C");
            selectList.Add(kvp1);
            selectList.Add(kvp2);
            selectList.Add(kvp3);
            listBox1.DisplayMember = "value";
            listBox1.ValueMember = "key";
            //リストボックスの項目をselectListに紐づけ
            listBox1.DataSource = selectList;
        }
        
        public String SelectedKey
        {
            get { return selectedKey; }
        }

        public String SelectedValue
        {
            get { return selectedValue; }
        }

        public void addSelectList(String key, String value)
        {
            KeyValuePair<String, String> kvp = new KeyValuePair<string, string>(key, value);
            selectList.Add(kvp);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(listBox1.SelectedIndex >= 0)
            {
                selectedKey = listBox1.SelectedValue.ToString();
                selectedValue = ((KeyValuePair<String, String>)listBox1.SelectedItem).Value;
            }
            this.Close();
        }
    }
}
