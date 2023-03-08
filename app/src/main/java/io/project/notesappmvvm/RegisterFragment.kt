package io.project.notesappmvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import io.project.notesappmvvm.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private var _binding:FragmentRegisterBinding? = null
    //to make it null safe
    //binding is pointing to
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        //and the corresponding view will be stored in this variable
//        val view = inflater.inflate(R.layout.fragment_register, container, false)
//        val txtRedirect = view.findViewById<TextView>(R.id.txtRedirect)
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

//        return view
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        //setting binding obj to null, to free up memory
        _binding = null
    }

}