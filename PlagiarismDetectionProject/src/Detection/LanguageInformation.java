package Detection;

import java.util.Map;
import java.util.TreeMap;

/*
 * Դ������Ϣ�����࣬���ڳ�ʼ���û��ϴ���Դ�������Ϣ������ϵͳ�ؼ��ֵĳ��ִ���
 * 
 * ���ã�����Ӧ�ñ�Դ��������ã���ÿ������һ�����󣬼�һ���ϴ��û�����ʱ��Ӧ�ý���
 * ��Ϣ��ʼ����
 * 
 */
public class LanguageInformation {
	
	/*
	 * ��Ŵ�����Ҫ����ȫ����Ϣ�����ҽ����ʼ��
	 */
	//Map�࣬���ڴ�Źؼ��������±꣬ģ�����飬���ڲ���
	public static Map<String,Integer> keyWordNameMap;
	//�ؼ�������--32��
	public static int KEY_WORD_NUMBER = 32;
	//���������ؼ���ͳ��
	public static Map<String,Integer> keyWord_variablesMap;
	//��������ϵͳ��������--8��
	public static int SYS_VARIABLES = 8;

	static {
		//C����ϵͳ�ؼ���--32��
		String[] keyWord = {
				"char","short","int","long","enum","float","double","signed",
				"unsigned","struct","union","void","for","do","while","break",
				"continue","if","else","goto","switch","case","default","return",
				"auto","static","extern","register","const","sizeof","typedef","volatile"
		}; 
		//ʵ����Map�������ڴ洢�ؼ���
		keyWordNameMap = new TreeMap<String,Integer>();
		//��ʼ���ؼ����±�
		for(int i = 0; i < KEY_WORD_NUMBER; i++){
			keyWordNameMap.put(keyWord[i], i);
		}
		
		/*
		 * �������ؼ����Ƿ�ͳ�ƵĹ�ϵ������Դ������ʱ�Ĵ����ŵĲ㼶��ϵ�����ж�
		 */
		String[] keyWord_variables = {
				"char","short","int","long","float","double","unsigned","auto"
		};
		//ʵ����keyWord_variablesMap�������ڴ洢�ؼ���λ��
		keyWord_variablesMap = new TreeMap<String,Integer>();
		//��ʼ���ؼ����±�
		for(int i = 0; i < SYS_VARIABLES; i++){
			keyWord_variablesMap.put(keyWord_variables[i], i);
		}
	}
}
