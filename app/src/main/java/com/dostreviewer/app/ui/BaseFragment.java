package com.dostreviewer.app.ui;
import androidx.fragment.app.Fragment;import com.dostreviewer.app.MainActivity;
public abstract class BaseFragment extends Fragment { protected MainActivity app(){return (MainActivity)requireActivity();} }
